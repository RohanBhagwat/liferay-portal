/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.tags.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;

import com.liferay.portlet.tags.service.TagsEntryServiceUtil;

/**
 * <a href="TagsEntryServiceJSON.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides a JSON utility for the
 * <code>com.liferay.portlet.tags.service.TagsEntryServiceUtil</code>
 * service utility. The static methods of this class calls the same methods of
 * the service utility. However, the signatures are different because it is
 * difficult for JSON to support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to a
 * <code>com.liferay.portal.kernel.json.JSONArray</code>. If the method in the
 * service utility returns a <code>com.liferay.portlet.tags.model.TagsEntry</code>,
 * that is translated to a
 * <code>com.liferay.portal.kernel.json.JSONObject</code>. Methods that JSON
 * cannot safely use are skipped. The logic for the translation is encapsulated
 * in <code>com.liferay.portlet.tags.service.http.TagsEntryJSONSerializer</code>.
 * </p>
 *
 * <p>
 * This allows you to call the the backend services directly from JavaScript.
 * See <code>portal-web/docroot/html/portlet/tags_admin/unpacked.js</code> for a
 * reference of how that portlet uses the generated JavaScript in
 * <code>portal-web/docroot/html/js/service.js</code> to call the backend
 * services directly from JavaScript.
 * </p>
 *
 * <p>
 * The JSON utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portlet.tags.service.TagsEntryServiceUtil
 * @see com.liferay.portlet.tags.service.http.TagsEntryJSONSerializer
 *
 */
public class TagsEntryServiceJSON {
	public static JSONObject addEntry(java.lang.String name)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.addEntry(name);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject addEntry(java.lang.String name,
		java.lang.String[] properties)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.addEntry(name,
				properties);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject addEntry(java.lang.String name,
		java.lang.String vocabularyName, java.lang.String[] properties)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.addEntry(name,
				vocabularyName, properties);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject addEntry(java.lang.String parentEntryName,
		java.lang.String name, java.lang.String vocabularyName,
		java.lang.String[] properties)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.addEntry(parentEntryName,
				name, vocabularyName, properties);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static void deleteEntry(long entryId)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		TagsEntryServiceUtil.deleteEntry(entryId);
	}

	public static JSONArray getEntries(java.lang.String className, long classPK)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException {
		java.util.List<com.liferay.portlet.tags.model.TagsEntry> returnValue = TagsEntryServiceUtil.getEntries(className,
				classPK);

		return TagsEntryJSONSerializer.toJSONArray(returnValue);
	}

	public static JSONArray getEntries(long groupId, long companyId,
		long classNameId, java.lang.String name)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException {
		java.util.List<com.liferay.portlet.tags.model.TagsEntry> returnValue = TagsEntryServiceUtil.getEntries(groupId,
				companyId, classNameId, name);

		return TagsEntryJSONSerializer.toJSONArray(returnValue);
	}

	public static JSONObject getEntry(long entryId)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.getEntry(entryId);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONArray getVocabularyEntries(long companyId,
		java.lang.String vocabularyName)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		java.util.List<com.liferay.portlet.tags.model.TagsEntry> returnValue = TagsEntryServiceUtil.getVocabularyEntries(companyId,
				vocabularyName);

		return TagsEntryJSONSerializer.toJSONArray(returnValue);
	}

	public static void mergeEntries(long fromEntryId, long toEntryId)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		TagsEntryServiceUtil.mergeEntries(fromEntryId, toEntryId);
	}

	public static JSONArray search(long companyId, java.lang.String name,
		java.lang.String[] properties)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException {
		java.util.List<com.liferay.portlet.tags.model.TagsEntry> returnValue = TagsEntryServiceUtil.search(companyId,
				name, properties);

		return TagsEntryJSONSerializer.toJSONArray(returnValue);
	}

	public static JSONArray search(long companyId, java.lang.String name,
		java.lang.String[] properties, int start, int end)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException {
		java.util.List<com.liferay.portlet.tags.model.TagsEntry> returnValue = TagsEntryServiceUtil.search(companyId,
				name, properties, start, end);

		return TagsEntryJSONSerializer.toJSONArray(returnValue);
	}

	public static com.liferay.portal.kernel.json.JSONArray searchAutocomplete(
		long companyId, java.lang.String name, java.lang.String[] properties,
		int start, int end)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException {
		com.liferay.portal.kernel.json.JSONArray returnValue = TagsEntryServiceUtil.searchAutocomplete(companyId,
				name, properties, start, end);

		return returnValue;
	}

	public static int searchCount(long companyId, java.lang.String name,
		java.lang.String[] properties)
		throws java.rmi.RemoteException, com.liferay.portal.SystemException {
		int returnValue = TagsEntryServiceUtil.searchCount(companyId, name,
				properties);

		return returnValue;
	}

	public static JSONObject updateEntry(long entryId, java.lang.String name)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.updateEntry(entryId,
				name);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject updateEntry(long entryId,
		java.lang.String parentEntryName, java.lang.String name,
		java.lang.String vocabularyName)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.updateEntry(entryId,
				parentEntryName, name, vocabularyName);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject updateEntry(long entryId, java.lang.String name,
		java.lang.String[] properties)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.updateEntry(entryId,
				name, properties);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}

	public static JSONObject updateEntry(long entryId,
		java.lang.String parentEntryName, java.lang.String name,
		java.lang.String vocabularyName, java.lang.String[] properties)
		throws java.rmi.RemoteException, com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		com.liferay.portlet.tags.model.TagsEntry returnValue = TagsEntryServiceUtil.updateEntry(entryId,
				parentEntryName, name, vocabularyName, properties);

		return TagsEntryJSONSerializer.toJSONObject(returnValue);
	}
}