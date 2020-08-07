<template>
  <div id="avatar">
    <img src="../../assets/img/avatar.png" alt="" @click="jumpHome">
  </div>
</template>

<script>
  export default {
    name: "Avatar",
    components: {},
    methods: {
      jumpHome() {
        this.$router.replace("/info")
      }
    }
  }
</script>

<style scoped>
  #avatar {
    width: 100%;
    height: 100%;
    display: block;
    margin-left: auto;
    margin-right: auto;
    margin-bottom: 1em;
  }

  img {
    width: 55%;
    height: 55%;
    margin-bottom: 0.5em;
    transition: all 0.5s linear;
  }

  img:hover {
    transform: scale(1.1);
    transition: all 0.5s ease-in-out;
  }
</style>