/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDisconnectValidateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CustomerIdEquipMapDisconnectValidateRequest Udt Request
 *
 */

public class CustomerIdEquipMapDisconnectValidateRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a  CustomerIdEquipMapDisconnectValidateRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapDiscValidateIn CustomerIdEquipMapObjectData for CustomerIdEquipMapDisconnectValidateRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapDisconnectValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData CustomerIdEquipMapDiscValidateIn) {
    super(id, "CustomerIdEquipMapDisconnectValidate");
    if (CustomerIdEquipMapDiscValidateIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapDiscValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
