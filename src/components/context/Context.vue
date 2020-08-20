<template>
  <div id="context">
    <div id="markdown" v-html="Context"></div>
  </div>
</template>

<script>
  import marked from "@/components/context/marked"
  import data from "@/components/data.js"

  let markdown = function(title, summary, time, author) {
    title = "### " + title + "\n";
    title = title + "---" + "\n";
    return marked(title + summary)
  }

  export default {
    name: "Context",
    data() {
      return {
      }
    },
    computed: {
      ID() {
        return this.$route.params.id - 1
      },
      Context() {
        return markdown(data[this.ID].title, data[this.ID].summary, data[this.ID].time, data[this.ID].author)
      }
    }
  }
</script>

<style scoped>

</style>