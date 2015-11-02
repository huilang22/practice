/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseFindBulkUdtTemplateItem.java
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
 * Class used to create a ClearingHouseFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseObjectFilter CHIFindIn;
/**
 *
 * Constructor to create a  ClearingHouseFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectFilter CHIFindInIn) {
    super(id, context, "ClearingHouseFind");
    CHIFindIn = CHIFindInIn;
  }

  public void translateToMap() {
    if (CHIFindIn != null) {
      Integer index =  CHIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(CHIFindIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }


/**
 *
 * Sets the ClearingHouse
 * @param CHIFindInIn Value of the CHIFindIn
 *
 */

  public void setClearingHouse(ClearingHouseObjectFilter CHIFindInIn) {
    CHIFindIn = CHIFindInIn;
  }

  public void translateFromMap() {
    CHIFindIn = ClearingHouseObjectHelper.fromMapFilter(inputMap, "ClearingHouse");
  }

/**
 *
 * Gets the ClearingHouse
 * @return Value of the ClearingHouse
 *
 */

  public ClearingHouseObjectFilter getClearingHouse( ) {
    return CHIFindIn;
  }

}
