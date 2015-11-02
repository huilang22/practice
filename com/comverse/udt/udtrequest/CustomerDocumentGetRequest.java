/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CustomerDocumentGetRequest Udt Request
 *
 */

public class CustomerDocumentGetRequest extends CustomerDocumentSubRequestParent {
/**
 *
 * Constructor to create a  CustomerDocumentGetRequest
 * @param id Unique request name
 * @param CustomerDocumentGetIn CustomerDocumentObjectKeyData for CustomerDocumentGetRequest
 *
 */
@JsonCreator
  public CustomerDocumentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerDocument")CustomerDocumentObjectKeyData CustomerDocumentGetIn) {
    super(id, "CustomerDocumentGet");
    if (CustomerDocumentGetIn != null) {
      addInput("CustomerDocument", CustomerDocumentObjectKeyHelper.toMap(CustomerDocumentGetIn, new HashMap(), "CustomerDocumentObjectKeyData").get("CustomerDocumentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CustomerDocumentObjectData that results from the CustomerDocumentGetRequest call
 * @return CustomerDocumentObjectData resulting from udt call
 *
 */

  public CustomerDocumentObjectData getOutput() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
}
