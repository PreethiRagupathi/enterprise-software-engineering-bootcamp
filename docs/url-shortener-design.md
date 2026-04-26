URL Shortener System Design

A URL shortener is a system that converts long URLs into shorter, easy-to-share links. When a user accesses the short URL, the system redirects them to the original long URL.

Requirements

The system should allow users to submit long URLs, generate unique short URLs, and redirect users correctly. It should also support high scalability, high availability, low latency, and high throughput to ensure efficient performance.

API Service

The API service handles incoming requests from users. It generates short URLs for long links and processes redirection requests when users access the shortened URL.

Database

The database stores the mapping between short URLs and long URLs, ensuring that each short link correctly points to its original URL.

Cache

The cache stores frequently accessed URL mappings to reduce database load and improve response time, resulting in faster redirection.

Load Balancer

The load balancer distributes incoming traffic across multiple API servers, preventing overload and improving system performance and reliability.

Data Flow

When a user submits a long URL, the API service generates a unique short code, stores it in the database, and returns the short URL. When the short URL is accessed, the request goes through the load balancer to the API, which first checks the cache and then the database if needed, before redirecting the user.

Scalability

The system supports scalability by adding multiple servers and distributing traffic using a load balancer, allowing it to handle increasing user demand.

Availability

High availability is achieved by using multiple servers so that if one server fails, others can continue to serve requests.

Latency

Latency is minimized by using a cache to quickly retrieve frequently accessed URLs, reducing response time.

Throughput

Throughput is improved by handling multiple requests simultaneously using distributed servers, enabling the system to process a large number of requests per second.
