/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByAddressIdRequest.java
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
 * Class used to create a AccountLocateFindByAddressIdRequest Udt Request
 *
 */

public class AccountLocateFindByAddressIdRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a  AccountLocateFindByAddressIdRequest
 * @param id Unique request name
 * @param alafIn AddressLocateXIDObjectFilter for AccountLocateFindByAddressIdRequest
 *
 */
@JsonCreator
  public AccountLocateFindByAddressIdRequest(@JsonProperty("RequestId") String id, @JsonProperty("AlafIn")AddressLocateXIDObjectFilter alafIn) {
    super(id, "AccountLocateFindByAddressId");
    if (alafIn != null) {
      Integer index =  alafIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AlafIn", AddressLocateXIDObjectHelper.toMap(alafIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }

/**
 *
 * Retrieves the AddressLocateXIDObjectDataList that results from the AccountLocateFindByAddressIdRequest call
 * @return AddressLocateXIDObjectDataList resulting from udt call
 *
 */

  public AddressLocateXIDObjectDataList getOutput() {
    return AddressLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
