/*
 * Generated code DO NOT EDIT
 * Generated file: AccountLocateFindByAddressIdNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AccountLocateFindByAddressIdNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountLocateFindByAddressIdNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AddressLocateXIDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountLocateFindByAddressIdNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountLocateFindByAddressIdNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AddressLocateXIDObjectDataList noOpInIn) {
    super(id, context, "AccountLocateFindByAddressId");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = AddressLocateXIDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountLocate", noOpIn);
      }
      addInput("AccountLocate", mapList);
    }
  }
/**
 *
 * Sets the  AccountLocate
 * @param noOpInIn AddressLocateXIDObjectDataList to set
 *
 */
  public void setAccountLocate(AddressLocateXIDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountLocate passed into the constructor
 * @return Simulated response
 *
 */
  public AddressLocateXIDObjectDataList getAccountLocate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AddressLocateXIDObjectHelper.fromMapList(inputMap, "AccountLocateList");
  }
}
