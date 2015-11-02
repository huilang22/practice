/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentUpdateRequest.java
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
 * Class used to create a CustomerDocumentUpdateRequest Udt Request
 *
 */

public class CustomerDocumentUpdateRequest extends CustomerDocumentSubRequestParent {
/**
 *
 * Constructor to create a  CustomerDocumentUpdateRequest
 * @param id Unique request name
 * @param CustomerDocumentUpdateIn CustomerDocumentObjectData for CustomerDocumentUpdateRequest
 *
 */
@JsonCreator
  public CustomerDocumentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerDocument")CustomerDocumentObjectData CustomerDocumentUpdateIn) {
    super(id, "CustomerDocumentUpdate");
    if (CustomerDocumentUpdateIn != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentUpdateIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }

/**
 *
 * Retrieves the CustomerDocumentObjectData that results from the CustomerDocumentUpdateRequest call
 * @return CustomerDocumentObjectData resulting from udt call
 *
 */

  public CustomerDocumentObjectData getOutput() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
}
