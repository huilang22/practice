/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeUpdateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DocumentTypeUpdateRequest Udt Request
 *
 */

public class DocumentTypeUpdateRequest extends DocumentTypeSubRequestParent {
/**
 *
 * Constructor to create a  DocumentTypeUpdateRequest
 * @param id Unique request name
 * @param DocTypeupdate_In DocumentTypeObjectData for DocumentTypeUpdateRequest
 *
 */
@JsonCreator
  public DocumentTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DocumentType")DocumentTypeObjectData DocTypeupdate_In) {
    super(id, "DocumentTypeUpdate");
    if (DocTypeupdate_In != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(DocTypeupdate_In, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }

/**
 *
 * Retrieves the DocumentTypeObjectData that results from the DocumentTypeUpdateRequest call
 * @return DocumentTypeObjectData resulting from udt call
 *
 */

  public DocumentTypeObjectData getOutput() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
}
