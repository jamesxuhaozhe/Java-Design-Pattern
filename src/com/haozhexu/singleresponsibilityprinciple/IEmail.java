package com.haozhexu.singleresponsibilityprinciple;

public interface IEmail {
	void setSender(final ISender sender);
	void setReceiver(final IReceiver receiver);
	void setContent(final IContent content);
}
