var app = new Vue({
    el: '#app',
    data: {
        pageInfo:'',
        pageNum:1
    },
    methods:{
        searchProduct(){
            axios.get('/product/search', {
                params: {
                    pageNum:this.pageNum
                }
              })
              .then(function (response) {
                console.log(response);
                app.pageInfo=response.data;
                //this.pageInfo=response.data;
              })
              .catch(function (error) {
                console.log(error);
              });
        }
    },
    mounted(){
        console.log('成功');
        this.searchProduct();
    }
})