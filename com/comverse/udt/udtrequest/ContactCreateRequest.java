/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactCreateRequest.java
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
 * Class used to create a ContactCreateRequest Udt Request
 *
 */

public class ContactCreateRequest extends ContactSubRequestParent {
/**
 *
 * Constructor to create a  ContactCreateRequest
 * @param id Unique request name
 * @param ContactCreateIn ContactObjectData for ContactCreateRequest
 *
 */
@JsonCreator
  public ContactCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Contact")ContactObjectData ContactCreateIn) {
    super(id, "ContactCreate");
    if (ContactCreateIn != null) {
      addInput("Contact", ContactObjectHelper.toMap(ContactCreateIn, new HashMap(), "Contact").get("Contact"));
    }
  }

/**
 *
 * Retrieves the ContactObjectData that results from the ContactCreateRequest call
 * @return ContactObjectData resulting from udt call
 *
 */

  public ContactObjectData getOutput() {
    return ContactObjectHelper.fromMap(outputMap, "Contact");
  }
}
