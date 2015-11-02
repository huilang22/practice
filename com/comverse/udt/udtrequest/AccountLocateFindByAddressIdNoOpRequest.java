/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByAddressIdNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a AccountLocateFindByAddressIdNoOpRequest Udt Request/Response
 *
 */
public class AccountLocateFindByAddressIdNoOpRequest extends AccountLocateRequest {
/**
 *
 * Constructor to create a   AccountLocateFindByAddressIdNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public AccountLocateFindByAddressIdNoOpRequest(String id, AddressLocateXIDObjectDataList noOpIn) {
    super(id, "AccountLocateFindByAddressIdNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = AddressLocateXIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountLocate", noOpIn);
      }
      addInput("AccountLocate", mapList);
    }
  }
/**
 *
 * Retrieves the AddressLocateXIDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public AddressLocateXIDObjectDataList getOutput() {
    return AddressLocateXIDObjectHelper.fromMapList(outputMap, "AccountLocateList");
  }
}
