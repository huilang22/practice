/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactUpdateRequest.java
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
 * Class used to create a ContactUpdateRequest Udt Request
 *
 */

public class ContactUpdateRequest extends ContactSubRequestParent {
/**
 *
 * Constructor to create a  ContactUpdateRequest
 * @param id Unique request name
 * @param ContactUpdateIn ContactObjectData for ContactUpdateRequest
 *
 */
@JsonCreator
  public ContactUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Contact")ContactObjectData ContactUpdateIn) {
    super(id, "ContactUpdate");
    if (ContactUpdateIn != null) {
      addInput("Contact", ContactObjectHelper.toMap(ContactUpdateIn, new HashMap(), "Contact").get("Contact"));
    }
  }

/**
 *
 * Retrieves the ContactObjectData that results from the ContactUpdateRequest call
 * @return ContactObjectData resulting from udt call
 *
 */

  public ContactObjectData getOutput() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
}
