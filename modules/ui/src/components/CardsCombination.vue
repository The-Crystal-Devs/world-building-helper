<template>
  <div v-for="card in cards">{{ card.ideas[0] }}</div>
</template>

<script>
export default {
  name: "CardsCombination",
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