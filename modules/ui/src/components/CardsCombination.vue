<template>
  <div v-for="card in cards"><PlacedCard :card="card"></PlacedCard></div>
</template>

<script>
import PlacedCard from "./PlacedCard.vue";

export default {
  name: "CardsCombination",
  components: {PlacedCard},
  props: {
    cards: {
      type: Array,
      required: true
    }
  }
}
</script>

<style scoped>

</style>