<template>
  <div id="info">
    <introduction class="introduction"></introduction>
  </div>
</template>

<script>
  import Introduction from "@/views/info/Introduction";

  export default {
    name: "Info",
    components: {Introduction}
  }
</script>

<style scoped>
  .introduction {
    position: relative;
    margin: 5em auto;
  }
</style>