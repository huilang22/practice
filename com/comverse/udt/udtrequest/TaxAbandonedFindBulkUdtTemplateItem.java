/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAbandonedFindBulkUdtTemplateItem.java
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
 * Class used to create a TaxAbandonedFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxAbandonedFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxAbandonedObjectFilter TAfind_In;
/**
 *
 * Constructor to create a  TaxAbandonedFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxAbandonedFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAbandonedObjectFilter TAfind_InIn) {
    super(id, context, "TaxAbandonedFind");
    TAfind_In = TAfind_InIn;
  }

  public void translateToMap() {
    if (TAfind_In != null) {
      Integer index =  TAfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxAbandoned", TaxAbandonedObjectHelper.toMap(TAfind_In, new HashMap(), "TaxAbandoned").get("TaxAbandoned"));
    }
  }


/**
 *
 * Sets the TaxAbandoned
 * @param TAfind_InIn Value of the TAfind_In
 *
 */

  public void setTaxAbandoned(TaxAbandonedObjectFilter TAfind_InIn) {
    TAfind_In = TAfind_InIn;
  }

  public void translateFromMap() {
    TAfind_In = TaxAbandonedObjectHelper.fromMapFilter(inputMap, "TaxAbandoned");
  }

/**
 *
 * Gets the TaxAbandoned
 * @return Value of the TaxAbandoned
 *
 */

  public TaxAbandonedObjectFilter getTaxAbandoned( ) {
    return TAfind_In;
  }

}
