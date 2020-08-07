<template>
  <div id="nav-bar-item" @click="itemClick(path)">
    <span>
      <slot name="icon"></slot>
      <slot name="link"></slot>
    </span>
    <div class="arrow">
      <slot name="arrow"></slot>
    </div>
    <slot class="children" name="children"></slot>
  </div>
</template>

<script>
  // 链接跳转
  function itemClick(path) {
    this.$router.replace(this.path)
  }

  export default {
    name: "NavBarItem",
    methods: {
      itemClick
    },
    props: {
      path: String
    }
  }
</script>

<style scoped>
  * {
    margin: 0;
    padding: 0;
  }

  span {
    line-height: 40px;
    margin-left: 1.5em;
  }

  span * {
    margin-right: 0.3em;
  }

  .arrow {
    font-size: 20px;
    float: right;
    margin-right: 1em;
    line-height: 40px;
  }

  .children a{
    margin-left: 25px;
    line-height: 40px;
  }
</style>