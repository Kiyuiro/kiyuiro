<template>
  <div id="avatar">
    <img src="../../assets/img/avatar.png" alt="" @click="jumpHome">
    <h1>绮羽伊罗</h1>
    <p>フブキは世界で最高</p>
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
    transition: all 0.2s linear;
  }

  img:hover {
    transform: rotate(30deg) scale(1.1);
    transition: all 0.2s linear;
  }

  h1 {
    font-size: 14px;
    color: #eaebed;
    padding: 0;
    margin: 0;
  }

  p {
    font-size: 12px;
    color: #8b8e99;
    margin-top: 0.2em;
  }
</style>