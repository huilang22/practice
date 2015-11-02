/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseContactsFindCountBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ClearingHouseContactsFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseContactsFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseContactsObjectFilter CHCFindCountIn;
/**
 *
 * Constructor to create a  ClearingHouseContactsFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseContactsFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseContactsObjectFilter CHCFindCountInIn) {
    super(id, context, "ClearingHouseContactsFindCount");
    CHCFindCountIn = CHCFindCountInIn;
  }

  public void translateToMap() {
    if (CHCFindCountIn != null) {
      Integer index =  CHCFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouseContacts", ClearingHouseContactsObjectHelper.toMap(CHCFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the ClearingHouseContacts
 * @param CHCFindCountInIn Value of the CHCFindCountIn
 *
 */

  public void setClearingHouseContacts(ClearingHouseContactsObjectFilter CHCFindCountInIn) {
    CHCFindCountIn = CHCFindCountInIn;
  }

  public void translateFromMap() {
    CHCFindCountIn = ClearingHouseContactsObjectHelper.fromMapFilter(inputMap, "ClearingHouseContacts");
  }

/**
 *
 * Gets the ClearingHouseContacts
 * @return Value of the ClearingHouseContacts
 *
 */

  public ClearingHouseContactsObjectFilter getClearingHouseContacts( ) {
    return CHCFindCountIn;
  }

}
