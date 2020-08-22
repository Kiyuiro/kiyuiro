<template>
  <div id="content">
    <div id="content-title">
      <h1>{{data[ID].title}}</h1>
    </div>
    <hr><br><br>
    <div id="content-summary">
      <p>{{data[ID].summary}}</p>
    </div>
    <div id="content-time">
      <p>{{data[ID].time}}</p>
    </div>
    <div id="content-author">
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
     box-shadow:0 0 20px 10px #ffffff inset;
     background-color: rgba(255, 255, 255, 0.4);
     padding: 1em 3em 3em 2em;
   }



</style>