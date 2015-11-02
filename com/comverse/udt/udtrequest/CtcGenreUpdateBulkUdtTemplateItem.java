/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcGenreUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGenreUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGenreObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcGenreUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGenreUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectData UpdateInIn) {
    super(id, context, "CtcGenreUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(UpdateIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }


/**
 *
 * Sets the CtcGenre
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcGenre(CtcGenreObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcGenreObjectHelper.fromMap(inputMap, "CtcGenre");
  }

/**
 *
 * Gets the CtcGenre
 * @return Value of the CtcGenre
 *
 */

  public CtcGenreObjectData getCtcGenre( ) {
    return UpdateIn;
  }

}
