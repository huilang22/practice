/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantFileCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * Class used to create a BatchRequestParticipantFileCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantFileCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParticipantObjectFilter BatchRequestParticipantFileCreateIn;
  protected String xml_file_name;
/**
 *
 * Constructor to create a  BatchRequestParticipantFileCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantFileCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectFilter BatchRequestParticipantFileCreateInIn, String xml_file_nameIn) {
    super(id, context, "BatchRequestParticipantFileCreate");
    BatchRequestParticipantFileCreateIn = BatchRequestParticipantFileCreateInIn;
    xml_file_name = xml_file_nameIn;
  }

  public void translateToMap() {
    if (BatchRequestParticipantFileCreateIn != null) {
      Integer index =  BatchRequestParticipantFileCreateIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(BatchRequestParticipantFileCreateIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (xml_file_name != null) {
      addInput("XmlFileName", xml_file_name);
    }
  }


/**
 *
 * Sets the BatchRequestParticipant
 * @param BatchRequestParticipantFileCreateInIn Value of the BatchRequestParticipantFileCreateIn
 *
 */

  public void setBatchRequestParticipant(BatchRequestParticipantObjectFilter BatchRequestParticipantFileCreateInIn) {
    BatchRequestParticipantFileCreateIn = BatchRequestParticipantFileCreateInIn;
  }

/**
 *
 * Sets the XmlFileName
 * @param xml_file_nameIn Value of the xml_file_name
 *
 */

  public void setXmlFileName(String xml_file_nameIn) {
    xml_file_name = xml_file_nameIn;
  }

  public void translateFromMap() {
    BatchRequestParticipantFileCreateIn = BatchRequestParticipantObjectHelper.fromMapFilter(inputMap, "BatchRequestParticipant");
    xml_file_name = (String)inputMap.get("XmlFileName");
  }

/**
 *
 * Gets the BatchRequestParticipant
 * @return Value of the BatchRequestParticipant
 *
 */

  public BatchRequestParticipantObjectFilter getBatchRequestParticipant( ) {
    return BatchRequestParticipantFileCreateIn;
  }

/**
 *
 * Gets the XmlFileName
 * @return Value of the XmlFileName
 *
 */

  public String getXmlFileName( ) {
    return xml_file_name;
  }

}
