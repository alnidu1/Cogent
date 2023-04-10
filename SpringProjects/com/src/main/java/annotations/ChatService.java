package annotations;

import org.springframework.stereotype.Component;

@Component
public class ChatService {

	private final HistoryService hs;
	private final ChatRoomService crs;
	public ChatService(HistoryService hs, ChatRoomService crs) {
		super();
		this.hs = hs;
		this.crs = crs;
	}
	
	
	public void chat() {
		hs.store();
		crs.start();
	}
}
