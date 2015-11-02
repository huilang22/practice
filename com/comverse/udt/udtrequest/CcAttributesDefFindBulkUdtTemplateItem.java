/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CcAttributesDefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CcAttributesDefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcAttributesDefObjectFilter CADfind_In;
/**
 *
 * Constructor to create a  CcAttributesDefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcAttributesDefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAttributesDefObjectFilter CADfind_InIn) {
    super(id, context, "CcAttributesDefFind");
    CADfind_In = CADfind_InIn;
  }

  public void translateToMap() {
    if (CADfind_In != null) {
      Integer index =  CADfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(CADfind_In, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }


/**
 *
 * Sets the CcAttributesDef
 * @param CADfind_InIn Value of the CADfind_In
 *
 */

  public void setCcAttributesDef(CcAttributesDefObjectFilter CADfind_InIn) {
    CADfind_In = CADfind_InIn;
  }

  public void translateFromMap() {
    CADfind_In = CcAttributesDefObjectHelper.fromMapFilter(inputMap, "CcAttributesDef");
  }

/**
 *
 * Gets the CcAttributesDef
 * @return Value of the CcAttributesDef
 *
 */

  public CcAttributesDefObjectFilter getCcAttributesDef( ) {
    return CADfind_In;
  }

}
