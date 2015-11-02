/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OccConeFxEntityMapFindBulkUdtTemplateItem.java
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
 * Class used to create a OccConeFxEntityMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OccConeFxEntityMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OCFEMObjectFilter OCFEMFindIn;
/**
 *
 * Constructor to create a  OccConeFxEntityMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OccConeFxEntityMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OCFEMObjectFilter OCFEMFindInIn) {
    super(id, context, "OccConeFxEntityMapFind");
    OCFEMFindIn = OCFEMFindInIn;
  }

  public void translateToMap() {
    if (OCFEMFindIn != null) {
      Integer index =  OCFEMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OccConeFxEntityMap", OCFEMObjectHelper.toMap(OCFEMFindIn, new HashMap(), "OccConeFxEntityMap").get("OccConeFxEntityMap"));
    }
  }


/**
 *
 * Sets the OccConeFxEntityMap
 * @param OCFEMFindInIn Value of the OCFEMFindIn
 *
 */

  public void setOccConeFxEntityMap(OCFEMObjectFilter OCFEMFindInIn) {
    OCFEMFindIn = OCFEMFindInIn;
  }

  public void translateFromMap() {
    OCFEMFindIn = OCFEMObjectHelper.fromMapFilter(inputMap, "OccConeFxEntityMap");
  }

/**
 *
 * Gets the OccConeFxEntityMap
 * @return Value of the OccConeFxEntityMap
 *
 */

  public OCFEMObjectFilter getOccConeFxEntityMap( ) {
    return OCFEMFindIn;
  }

}
