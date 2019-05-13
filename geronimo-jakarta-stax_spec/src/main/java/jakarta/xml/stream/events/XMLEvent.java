/*
 **
 ** Licensed to the Apache Software Foundation (ASF) under one
 ** or more contributor license agreements.  See the NOTICE file
 ** distributed with this work for additional information
 ** regarding copyright ownership.  The ASF licenses this file
 ** to you under the Apache License, Version 2.0 (the
 ** "License"); you may not use this file except in compliance
 ** with the License.  You may obtain a copy of the License at
 **
 **  http://www.apache.org/licenses/LICENSE-2.0
 **
 ** Unless required by applicable law or agreed to in writing,
 ** software distributed under the License is distributed on an
 ** "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 ** KIND, either express or implied.  See the License for the
 ** specific language governing permissions and limitations
 ** under the License.
 */
package jakarta.xml.stream.events;

import java.io.Writer;

import jakarta.xml.namespace.QName;
import jakarta.xml.stream.Location;
import jakarta.xml.stream.XMLStreamConstants;
import jakarta.xml.stream.XMLStreamException;

public interface XMLEvent extends XMLStreamConstants {
    public Characters asCharacters();

    public EndElement asEndElement();

    public StartElement asStartElement();

    public int getEventType();

    public Location getLocation();

    public QName getSchemaType();

    public boolean isAttribute();

    public boolean isCharacters();

    public boolean isEndDocument();

    public boolean isEndElement();

    public boolean isEntityReference();

    public boolean isNamespace();

    public boolean isProcessingInstruction();

    public boolean isStartDocument();

    public boolean isStartElement();

    public void writeAsEncodedUnicode(Writer writer) throws XMLStreamException;
}