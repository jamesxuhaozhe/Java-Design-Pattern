package com.haozhexu.single_responsibility_principle;

public interface IEmail {
	void setSender(final ISender sender);
	void setReceiver(final IReceiver receiver);
	void setContent(final IContent content);
}
