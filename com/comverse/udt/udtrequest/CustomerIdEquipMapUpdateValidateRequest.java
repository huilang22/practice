/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapUpdateValidateRequest.java
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
 * Class used to create a CustomerIdEquipMapUpdateValidateRequest Udt Request
 *
 */

public class CustomerIdEquipMapUpdateValidateRequest extends CustomerIdEquipMapRequest {
/**
 *
 * Constructor to create a  CustomerIdEquipMapUpdateValidateRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapUpdateValidateIn CustomerIdEquipMapObjectData for CustomerIdEquipMapUpdateValidateRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapUpdateValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectData CustomerIdEquipMapUpdateValidateIn) {
    super(id, "CustomerIdEquipMapUpdateValidate");
    if (CustomerIdEquipMapUpdateValidateIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(CustomerIdEquipMapUpdateValidateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
