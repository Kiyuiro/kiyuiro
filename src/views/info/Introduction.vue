<template>
  <div id="introduction">
    <div class="avatar">
      <avatar></avatar>
    </div>
  </div>
</template>

<script>
  import Avatar from "@/views/info/Avatar";

  export default {
    name: "Introduction",
    components: {Avatar}
  }
</script>

<style scoped>
  #introduction {
    width: 50%;
    height: 30vh;
    margin: 5em auto;
    background: rgb(181, 161, 145);
  }

  .avatar {
    width: 60px;
    height: 60px;
  }
</style>