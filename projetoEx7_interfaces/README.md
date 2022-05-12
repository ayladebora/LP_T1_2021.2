# Build
mvn clean package && docker build -t br.ufpb.dcx.figuras/exercicio7 .

# RUN

docker rm -f exercicio7 || true && docker run -d -p 8080:8080 -p 4848:4848 --name exercicio7 br.ufpb.dcx.figuras/exercicio7 