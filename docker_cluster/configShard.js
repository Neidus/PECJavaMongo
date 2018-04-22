rs.initiate(
    {
       _id: "nodoShard",
       version: 1,
       members: [
          { _id: 0, host : "nodoShard1" },
          { _id: 1, host : "nodoShard2" },
          { _id: 2, host : "nodoShard3" }
       ]
    }
 )