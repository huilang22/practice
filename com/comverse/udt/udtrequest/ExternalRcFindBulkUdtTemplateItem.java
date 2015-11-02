/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ExternalRcFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalRcFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalRcObjectFilter ExternalRcFindIn;
/**
 *
 * Constructor to create a  ExternalRcFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalRcFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalRcObjectFilter ExternalRcFindInIn) {
    super(id, context, "ExternalRcFind");
    ExternalRcFindIn = ExternalRcFindInIn;
  }

  public void translateToMap() {
    if (ExternalRcFindIn != null) {
      Integer index =  ExternalRcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(ExternalRcFindIn, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }


/**
 *
 * Sets the ExternalRc
 * @param ExternalRcFindInIn Value of the ExternalRcFindIn
 *
 */

  public void setExternalRc(ExternalRcObjectFilter ExternalRcFindInIn) {
    ExternalRcFindIn = ExternalRcFindInIn;
  }

  public void translateFromMap() {
    ExternalRcFindIn = ExternalRcObjectHelper.fromMapFilter(inputMap, "ExternalRc");
  }

/**
 *
 * Gets the ExternalRc
 * @return Value of the ExternalRc
 *
 */

  public ExternalRcObjectFilter getExternalRc( ) {
    return ExternalRcFindIn;
  }

}
