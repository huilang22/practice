/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactGetRequest.java
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
 * Class used to create a ContactGetRequest Udt Request
 *
 */

public class ContactGetRequest extends ContactSubRequestParent {
/**
 *
 * Constructor to create a  ContactGetRequest
 * @param id Unique request name
 * @param ContactgetIn ContactObjectKeyData for ContactGetRequest
 *
 */
@JsonCreator
  public ContactGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Contact")ContactObjectKeyData ContactgetIn) {
    super(id, "ContactGet");
    if (ContactgetIn != null) {
      addInput("Contact", ContactObjectKeyHelper.toMap(ContactgetIn, new HashMap(), "ContactObjectKeyData").get("ContactObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ContactObjectData that results from the ContactGetRequest call
 * @return ContactObjectData resulting from udt call
 *
 */

  public ContactObjectData getOutput() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
}
