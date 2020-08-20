<template>
  <div id="content-module" @click="JumpLink(path)">
    <slot name="img"></slot>
    <div class="content">
      <slot name="title"></slot>
      <slot name="summary"></slot>
      <slot name="time"></slot>
    </div>
  </div>
</template>

<script>
  // 链接跳转
  function JumpLink(path) {
    if (path !== undefined) {
      this.$router.push(this.path)
    }
  }

  export default {
    name: "ContentModule",
    methods: {
      JumpLink
    },
    props: {
      path: String
    }
  }
</script>

<style scoped>
  #content-module {
    margin: 2em auto;
    width: 100%;
    height: 240px;
    display: block;
    border-radius: 10px;
    overflow: hidden;
  }

  .content {
    width: 100%;
    height: 100%;
    margin-top: -240px;
    line-height: 240px;
  }

  @media screen and (max-width: 600px) {
    #content-module {
      margin: 2em auto;
      width: 100%;
      height: 160px;
      display: block;
      border-radius: 10px;
      overflow: hidden;
      background-color: rgba(255, 255, 255, 0.8);
      transition: all 0.2s linear;
    }

    #content-module:hover {
      box-shadow: inset 0 0 0.25em 0.25em rgba(0, 0, 0, 0.2);
      transition: all 0.2s linear;
    }

    .content {
      width: 100%;
      height: 100%;
      margin-top: -100px;
      line-height: 8px;
      position: relative;
    }
  }
</style>