<template>
  <div id="content">
    <div id="title">
      <h1>{{data[ID].title}}</h1>
    </div>
    <hr>
    <div id="summary">
      <p>{{data[ID].summary}}</p>
    </div>
    <div id="time">
      <p>{{data[ID].time}}</p>
    </div>
    <div id="author">
      <p>{{data[ID].author}}</p>
    </div>
  </div>
</template>

<script>
  import data from "@/components/data.js"

  export default {
    name: "Context",
    data() {
      return {
        data,
      }
    },
    computed: {
      ID() {
        return this.$route.params.id - 1
      },
    }
  }
</script>

<style scoped>
   #content {
     width: 50%;
     height: 100%;
     margin-top: 80px;
     margin-left: auto;
     margin-right: auto;
     border: 1px solid red;
     border-radius: 30px;
     background-color: rgba(255, 255, 255, 0.4);
     padding: 1em 1em 1em 1em;
   }

  #title {
    margin-left: auto;
    margin-right: auto;
    text-align: center;
  }


</style>