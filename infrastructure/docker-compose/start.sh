docker-compose -f common.yaml -f zookeeper.yml up

# wait zookeeper run 30-60s

docker-compose -f common.yaml -f kafka-cluster.yml up
# create kafka topics
docker-compose -f common.yaml -f init-kafka.yml up
