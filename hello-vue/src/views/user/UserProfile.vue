<template>
    <div>
      个人信息 ID = {{$route.params.id}} NAME = {{$route.params.name}}
      <!--个人信息 ID = {{$route.query.id}} NAME = {{$route.query.name}}-->
      <!--个人信息 ID = {{id}} NAME = {{name}}-->
    </div>
</template>

<script>
    export default {
      props: ['id', 'name'],
      name: "UserProfile",
      // to是要去的组件的对象, from来的组件对象,
      beforeRouteEnter: (to, from, next) => {
        console.log("准备进入个人信息页");
        next(vm => {
          vm.getData(); // 由于正在初始化,调用不到下面的方法,可以在next中使用回调来调下面的方法(仅在这个方法中适用:beforeRouteEnter).
        }); // 进入下一个路由,不写会阻塞
      },
      beforeRouteLeave: (to, from, next) => {
        console.log("准备离开个人信息页");
        next();
      },
      methods: {
        getData: function () {
          this.axios({
            method: 'get',
            url: 'http://localhost:8080/data.json'
          }).then(function (repos) {
            console.log(repos);
          }).catch(function (error) {
            console.log(error);
          });
        }
      }
    }
</script>

<style scoped>

</style>
