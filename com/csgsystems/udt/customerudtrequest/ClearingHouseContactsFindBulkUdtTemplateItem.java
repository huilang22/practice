/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseContactsFindBulkUdtTemplateItem.java
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
 * Class used to create a ClearingHouseContactsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseContactsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseContactsObjectFilter CHCFindIn;
/**
 *
 * Constructor to create a  ClearingHouseContactsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseContactsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindInIn) {
    super(id, context, "ClearingHouseContactsFind");
    CHCFindIn = CHCFindInIn;
  }

  public void translateToMap() {
    if (CHCFindIn != null) {
      Integer index =  CHCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouseContacts", ClearingHouseContactsObjectHelper.toMap(CHCFindIn, new HashMap(), "ClearingHouseContacts").get("ClearingHouseContacts"));
    }
  }


/**
 *
 * Sets the ClearingHouseContacts
 * @param CHCFindInIn Value of the CHCFindIn
 *
 */

  public void setClearingHouseContacts(ClearingHouseContactsObjectFilter CHCFindInIn) {
    CHCFindIn = CHCFindInIn;
  }

  public void translateFromMap() {
    CHCFindIn = ClearingHouseContactsObjectHelper.fromMapFilter(inputMap, "ClearingHouseContacts");
  }

/**
 *
 * Gets the ClearingHouseContacts
 * @return Value of the ClearingHouseContacts
 *
 */

  public ClearingHouseContactsObjectFilter getClearingHouseContacts( ) {
    return CHCFindIn;
  }

}
