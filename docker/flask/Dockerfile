FROM ubuntu


# Avoid tzdata asking for timezone
ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && \
    apt-get install -y python3 python3-pip python3-venv && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /opt/source-code

COPY app.py .

RUN python3 -m venv venv && \
    ./venv/bin/pip install --upgrade pip && \
    ./venv/bin/pip install flask flask-mysql

# Expose the Flask default port
EXPOSE 5000

# Start the app
CMD ["./venv/bin/python", "app.py"]

