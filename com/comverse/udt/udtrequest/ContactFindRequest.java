/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactFindRequest.java
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
 * Class used to create a ContactFindRequest Udt Request
 *
 */

public class ContactFindRequest extends ContactRequest {
/**
 *
 * Constructor to create a  ContactFindRequest
 * @param id Unique request name
 * @param ContactfindIn ContactObjectFilter for ContactFindRequest
 *
 */
@JsonCreator
  public ContactFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Contact")ContactObjectFilter ContactfindIn) {
    super(id, "ContactFind");
    if (ContactfindIn != null) {
      Integer index =  ContactfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Contact", ContactObjectHelper.toMap(ContactfindIn, new HashMap(), "Contact").get("Contact"));
    }
  }

/**
 *
 * Retrieves the ContactObjectDataList that results from the ContactFindRequest call
 * @return ContactObjectDataList resulting from udt call
 *
 */

  public ContactObjectDataList getOutput() {
    return ContactObjectHelper.fromMapList(outputMap, "ContactList");
  }
}
