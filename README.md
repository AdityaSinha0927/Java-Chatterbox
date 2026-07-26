Chatterbox

A real-time, console-based messaging application built from scratch in Java — no frameworks, no shortcuts. Chatterbox is both a chat app and a structured learning project: every feature is added specifically to practice a software engineering concept in a real codebase, not just to make something that works.

Current version: V0.1 — Foundation (in progress)

Why This Project Exists

Most tutorials teach Java concepts in isolation. This project takes the opposite approach: build one continuously growing application, and let each new feature force the next concept to be learned by necessity — OOP, collections, threads, sockets, file I/O, databases, GUIs, and beyond. The long-term goal is simple — look back at this repo one day as proof of how the fundamentals were actually learned, not just memorized.

Features — V0.1 (Foundation)
Username input — user picks a username on startup
Client-server architecture — a central server manages all connected clients
Real-time public chat — messages sent and received instantly in one shared room
Broadcast messaging — every message is relayed to all connected users
Join/leave notifications — the chat announces when users connect or disconnect
/exit command — safely disconnect from the server
Timestamps — every message shows when it was sent
Console interface — runs entirely in the terminal (no GUI yet)
Concepts practiced in V0.1

OOP basics · Collections · Exception Handling · Threads · Socket Programming (ServerSocket, Socket, InputStream/OutputStream, BufferedReader, PrintWriter)

Development Roadmap
Version	Focus	Key Concepts
v0.1	Foundation — public chat, multiple clients, broadcast	OOP, Collections, Exceptions, Threads, Sockets
v0.2	Better UX — online users list, command handling, validation	HashMap, string parsing, architecture
v0.3	Private messaging (/msg <user> <text>)	HashMap, searching, object relationships
v0.4	Chat rooms (create/join/leave, room broadcast)	Collections, OOP design
v0.5	Persistent storage — save/load users, messages, rooms	File handling, serialization
v0.6	Database — replace file storage with a real DB	SQL, JDBC, MySQL/PostgreSQL
v0.7	Authentication — register, login, sessions	Security, password hashing
v0.8	GUI — login and chat windows, notifications	JavaFX, event handling
v0.9	File sharing — images, PDFs, videos, upload progress	Streams, binary files, networking
v1.0	Chatterbox — full release combining everything above	—
<details> <summary>Expand full feature breakdown by version</summary>
v0.2 — Better User Experience

Online users list · welcome message · improved command handling · better error messages · polished console UI · optional colored output · username validation

v0.3 — Private Messaging

Direct messages via /msg Rahul Hello · user lookup · unique usernames · message routing · inbox while online

v0.4 — Chat Rooms

Rooms such as General, Gaming, Study, Coding, Music · create/join/leave room · room-scoped broadcast · room list

v0.5 — Persistent Storage

Save/load users, messages, and rooms across restarts (file-based, with optional serialization)

v0.6 — Database

User database · message history · message search · replaces file storage with SQL via JDBC (MySQL/PostgreSQL)

v0.7 — Authentication

Register · login · password hashing · sessions · logout

v0.8 — GUI

Login window · chat window · user list · scrollable chat history · notifications (JavaFX)

v0.9 — File Sharing

Send/receive images, PDFs, and videos · upload progress tracking

v1.0 — Chatterbox (Full Release)

✅ Group chat · ✅ Private chat · ✅ Chat rooms · ✅ Login/register · ✅ Database · ✅ GUI · ✅ File sharing · ✅ Search · ✅ Message history · ✅ Online users list

</details>
Tech Stack
Language: Java
Networking: Raw java.net sockets (no external libraries)
Planned additions: JDBC (v0.6), JavaFX (v0.8)
Getting Started

Setup instructions will be added once V0.1 is complete and runnable end-to-end.

Project Status

🚧 Actively in development — V0.1 in progress.

License

Not yet decided.