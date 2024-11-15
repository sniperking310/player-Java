# BitWars Player Java
Your task is to implement the best bitWars player logic! :)

## Preparation
1. Choose a team name (BitBattler?)
2. Fork this repository
3. Add the following secret:
    * TOKEN (value will be provided by the facilitator)
4. Add the following variables:
    * NAMESPACE (value will be provided by the facilitator)
    * TEAMNAME (your team name - only lowercase letters, digits and dashes, must start with a lowercase letter)
4. Run the main workflow in GitHub - it will be deployed automatically
5. Notify the facilitator once you are done :)

## How it works

### Run it locally
Run the player directly:
```bash
mvn spring-boot:run
```

### Functionality
This application template provides a HTTP server with a single POST endpoint (/) on port `3000`.
The bit-dealer sends a POST request containing the current game state as a JSON object.
Your task is to implement a function which returns a `PlayerAction` as a response.
You'll find a predefined function `decide()` in this file: `logic/Strategy.java`.
In this file you can add unit-tests to quickly debug your application locally.
Run all unit-tests with the following command (executed in the root path of this project):
```bash
mvn test
```


## Example Request Body
```json
{
   "actions":[
      {
         "uuid":"52c3866e-4481-41ac-8470-cac378788567",
         "player":1002,
         "src":1,
         "dest":2,
         "amount":1,
         "progress":{
            "distance":4,
            "traveled":4
         }
      }
   ],
   "bases":[
      {
         "uid":1,
         "player":1001,
         "population":2,
         "level":0,
         "units_until_upgrade":0,
         "position":{
            "x":0,
            "y":0,
            "z":0
         }
      },
      {
         "uid":2,
         "player":0,
         "population":7,
         "level":1,
         "units_until_upgrade":0,
         "position":{
            "x":3,
            "y":-3,
            "z":0
         }
      },
      {
         "uid":3,
         "player":0,
         "population":12,
         "level":1,
         "units_until_upgrade":0,
         "position":{
            "x":3,
            "y":3,
            "z":0
         }
      }
   ],
   "config":{
      "base_levels":[
         {
            "max_population":20,
            "upgrade_cost":1000,
            "spawn_rate":1
         },
         {
            "max_population":40,
            "upgrade_cost":1000,
            "spawn_rate":2
         },
         {
            "max_population":80,
            "upgrade_cost":1000,
            "spawn_rate":3
         },
         {
            "max_population":100,
            "upgrade_cost":1000,
            "spawn_rate":4
         },
         {
            "max_population":200,
            "upgrade_cost":1000,
            "spawn_rate":25
         }
      ],
      "paths":{
         "grace_period":10,
         "death_rate":1
      }
   },
   "game":{
      "uid":1,
      "tick":17,
      "player_count":3,
      "remaining_players":3,
      "player":1
   }
}
```

## Start the game

Now it's your turn! Start implementing the Strategy function to do more than just do nothing every turn.
Or rework the whole application.
You can do what you want, as long as you provide the endpoint that is registered in the game. Have fun!

## Rules

More Infos: https://bitwars.de/

---

## Current Strategy

1. Try to Conquer as many Bases as possible , in the beginning , that have no Owner .
2. Try to Conquer all Bases in the "Grace Distance"
3. Maximize Ressources in the beginning , Fuck position.
