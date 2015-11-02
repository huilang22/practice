/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewDefCreateBulkUdtTemplateItem.java
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
 * Class used to create a CcViewDefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CcViewDefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcViewDefObjectData CVDcreate_In;
/**
 *
 * Constructor to create a  CcViewDefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcViewDefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewDefObjectData CVDcreate_InIn) {
    super(id, context, "CcViewDefCreate");
    CVDcreate_In = CVDcreate_InIn;
  }

  public void translateToMap() {
    if (CVDcreate_In != null) {
      CVDcreate_In.resetFlags(true, true);
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(CVDcreate_In, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }


/**
 *
 * Sets the CcViewDef
 * @param CVDcreate_InIn Value of the CVDcreate_In
 *
 */

  public void setCcViewDef(CcViewDefObjectData CVDcreate_InIn) {
    CVDcreate_In = CVDcreate_InIn;
  }

  public void translateFromMap() {
    CVDcreate_In = CcViewDefObjectHelper.fromMap(inputMap, "CcViewDef");
  }

/**
 *
 * Gets the CcViewDef
 * @return Value of the CcViewDef
 *
 */

  public CcViewDefObjectData getCcViewDef( ) {
    return CVDcreate_In;
  }

}
