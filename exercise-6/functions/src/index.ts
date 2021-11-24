import * as functions from "firebase-functions";

// Start writing Firebase Functions
// https://firebase.google.com/docs/functions/typescript

export const currentTime = functions.https.onRequest((request, response) => {
  const currentDateTime = new Date();

  response.send({ currentDateTime });
});
