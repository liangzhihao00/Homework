package io.lzh.storeback.util;

@Component
public class JWTUtil {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${jwt.valid.duration}")
    private Long jwtValidDuration;

    @Value("${jwt.issuer}")
    private String issuer;

    private Algorithm algorithm;

    public JWTUtil(@Value("${jwt.HS256.secret}") String jwtHS256Secret) {
        logger.info("init jwt util");
        algorithm = Algorithm.HMAC256(jwtHS256Secret);
    }

    public CustomerLoginOutDTO issueToken(Customer customer) {
        Date now = new Date();
        long nowTimestamp = now.getTime();
        long expireTimestamp = nowTimestamp + jwtValidDuration;
        Date expireTime = new Date(expireTimestamp);
        Integer customerId = customer.getCustomerId();
        String username = customer.getUsername();

        String token = JWT.create()
                .withIssuer(issuer)
                .withIssuedAt(now)
                .withSubject(username)
                .withClaim("customerId", customerId)
                .withExpiresAt(expireTime)
                .sign(algorithm);

        logger.info("jwt token: {}", token);
        logger.info("jwt expire date: {}", expireTimestamp);
        CustomerLoginOutDTO customerLoginOutDTO = new CustomerLoginOutDTO();
        customerLoginOutDTO.setToken(token);
        customerLoginOutDTO.setExpireTimestamp(expireTimestamp);

        return customerLoginOutDTO;
    }

    public CustomerLoginVO verifyToken(String token) {
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer(issuer)
                .build();
        DecodedJWT jwt;
        jwt = verifier.verify(token);

        CustomerLoginVO customerLoginVO = new CustomerLoginVO();
        customerLoginVO.setCustomerId(jwt.getClaim("customerId").asInt());
        customerLoginVO.setUsername(jwt.getSubject());
        return customerLoginVO;
    }

}

