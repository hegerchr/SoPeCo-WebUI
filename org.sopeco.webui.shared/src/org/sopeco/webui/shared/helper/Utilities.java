/**
 * Copyright (c) 2013 SAP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the SAP nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SAP BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sopeco.webui.shared.helper;

/**
 * 
 * @author Marius Oehler
 * 
 */
public final class Utilities {
	private Utilities() {
	}

	/**
	 * Replaces all characters expect "a-zA-Z0-9_" (regex: [^a-zA-Z0-9_]) of the
	 * given String with "_".
	 * 
	 * @return
	 */
	public static String cleanString(String scenarioName) {
		return scenarioName.replaceAll("[^a-zA-Z0-9_]", "_");
	}
	
	/** Builds a short version of a parameter name.
	 *  Trims all substrings (divided by a '.') to their first letter except the last one.
	 * 
	 * @param parameterName The name of the parameter to trim.
	 * @return
	 */
	public static String trimParameter(String parameterName){
		if (parameterName == null)
			return null;
		String[] subs = parameterName.split("\\.");
		if (subs.length <= 0){
			return null;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < subs.length - 1; i++){
			builder.append(subs[i].charAt(0));
			builder.append(".");
		}
		builder.append(subs[subs.length-1]);
		return builder.toString();
	}
}
