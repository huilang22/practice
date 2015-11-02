/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeRateRcFindBulkUdtTemplateItem.java
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
 * Class used to create a UnitsTypeRateRcFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitsTypeRateRcFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitsTypeRcObjectFilter utrcFindIn;
/**
 *
 * Constructor to create a  UnitsTypeRateRcFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitsTypeRateRcFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeRcObjectFilter utrcFindInIn) {
    super(id, context, "UnitsTypeRateRcFind");
    utrcFindIn = utrcFindInIn;
  }

  public void translateToMap() {
    if (utrcFindIn != null) {
      Integer index =  utrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitsType", UnitsTypeRcObjectHelper.toMap(utrcFindIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }


/**
 *
 * Sets the UnitsType
 * @param utrcFindInIn Value of the utrcFindIn
 *
 */

  public void setUnitsType(UnitsTypeRcObjectFilter utrcFindInIn) {
    utrcFindIn = utrcFindInIn;
  }

  public void translateFromMap() {
    utrcFindIn = UnitsTypeRcObjectHelper.fromMapFilter(inputMap, "UnitsType");
  }

/**
 *
 * Gets the UnitsType
 * @return Value of the UnitsType
 *
 */

  public UnitsTypeRcObjectFilter getUnitsType( ) {
    return utrcFindIn;
  }

}
