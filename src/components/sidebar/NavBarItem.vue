<template>
  <div id="nav-bar-item" @click="itemClick(path)" >
    <span>
      <slot name="icon"></slot>
      <slot name="link"></slot>
      <div class="nav-bar-item-arrow">
        <slot name="arrow"></slot>
      </div>
    </span>
    <div class="nav-bar-item-children">
      <slot name="children"></slot>
    </div>
  </div>
</template>

<script>
  // 链接跳转
  function itemClick(path) {
    this.$router.push(this.path)
  }

  export default {
    name: "NavBarItem",
    methods: {
      itemClick
    },
    props: {
      path: String,
      isChildren: Boolean
    }
  }
</script>

<style scoped>
  * {
    margin: 0;
    padding: 0;
  }

  #nav-bar-item > span {
    line-height: 40px;
    margin-left: 1.5em;
    display: block;
    text-indent: 1px;
  }

  span * {
    margin-right: 0.4em;
  }

  .nav-bar-item-arrow {
    font-size: 20px;
    float: right;
    margin-right: 1em;
    line-height: 40px;
  }

  .nav-bar-item-children span {
    padding-left: 1.5em;
  }

</style>