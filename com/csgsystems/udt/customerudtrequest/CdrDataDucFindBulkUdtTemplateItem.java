/*
 * Generated code DO NOT EDIT
 * Generated file: CdrDataDucFindBulkUdtTemplateItem.java
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
 * Class used to create a CdrDataDucFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CdrDataDucFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CdrDataDucObjectFilter CdrDataDucFindIn;
/**
 *
 * Constructor to create a  CdrDataDucFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CdrDataDucFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CdrDataDucObjectFilter CdrDataDucFindInIn) {
    super(id, context, "CdrDataDucFind");
    CdrDataDucFindIn = CdrDataDucFindInIn;
  }

  public void translateToMap() {
    if (CdrDataDucFindIn != null) {
      Integer index =  CdrDataDucFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CdrDataDuc", CdrDataDucObjectHelper.toMap(CdrDataDucFindIn, new HashMap(), "CdrDataDuc").get("CdrDataDuc"));
    }
  }


/**
 *
 * Sets the CdrDataDuc
 * @param CdrDataDucFindInIn Value of the CdrDataDucFindIn
 *
 */

  public void setCdrDataDuc(CdrDataDucObjectFilter CdrDataDucFindInIn) {
    CdrDataDucFindIn = CdrDataDucFindInIn;
  }

  public void translateFromMap() {
    CdrDataDucFindIn = CdrDataDucObjectHelper.fromMapFilter(inputMap, "CdrDataDuc");
  }

/**
 *
 * Gets the CdrDataDuc
 * @return Value of the CdrDataDuc
 *
 */

  public CdrDataDucObjectFilter getCdrDataDuc( ) {
    return CdrDataDucFindIn;
  }

}
