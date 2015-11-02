/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewDefFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CcViewDefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CcViewDefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcViewDefObjectFilter CVDfind_In;
/**
 *
 * Constructor to create a  CcViewDefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcViewDefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewDefObjectFilter CVDfind_InIn) {
    super(id, context, "CcViewDefFind");
    CVDfind_In = CVDfind_InIn;
  }

  public void translateToMap() {
    if (CVDfind_In != null) {
      Integer index =  CVDfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(CVDfind_In, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }


/**
 *
 * Sets the CcViewDef
 * @param CVDfind_InIn Value of the CVDfind_In
 *
 */

  public void setCcViewDef(CcViewDefObjectFilter CVDfind_InIn) {
    CVDfind_In = CVDfind_InIn;
  }

  public void translateFromMap() {
    CVDfind_In = CcViewDefObjectHelper.fromMapFilter(inputMap, "CcViewDef");
  }

/**
 *
 * Gets the CcViewDef
 * @return Value of the CcViewDef
 *
 */

  public CcViewDefObjectFilter getCcViewDef( ) {
    return CVDfind_In;
  }

}
