/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExternalRcUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalRcUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalRcObjectData ExternalRcUpdateIn;
/**
 *
 * Constructor to create a  ExternalRcUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalRcUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalRcObjectData ExternalRcUpdateInIn) {
    super(id, context, "ExternalRcUpdate");
    ExternalRcUpdateIn = ExternalRcUpdateInIn;
  }

  public void translateToMap() {
    if (ExternalRcUpdateIn != null) {
      ExternalRcUpdateIn.resetFlags(true, true);
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(ExternalRcUpdateIn, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }


/**
 *
 * Sets the ExternalRc
 * @param ExternalRcUpdateInIn Value of the ExternalRcUpdateIn
 *
 */

  public void setExternalRc(ExternalRcObjectData ExternalRcUpdateInIn) {
    ExternalRcUpdateIn = ExternalRcUpdateInIn;
  }

  public void translateFromMap() {
    ExternalRcUpdateIn = ExternalRcObjectHelper.fromMap(inputMap, "ExternalRc");
  }

/**
 *
 * Gets the ExternalRc
 * @return Value of the ExternalRc
 *
 */

  public ExternalRcObjectData getExternalRc( ) {
    return ExternalRcUpdateIn;
  }

}
